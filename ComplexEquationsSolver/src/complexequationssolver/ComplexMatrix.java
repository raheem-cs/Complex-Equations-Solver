package complexequationssolver;

public class ComplexMatrix
{
    // Data Fields
    private int rows, columns;
    private Complex matrix[][];
    
    // Constructor
    public ComplexMatrix(int rows, int columns)
    {
        this.rows = rows;
        this.columns = columns;
        this.matrix = new Complex[rows][columns];
    }
    
    // Methods
    public int getRowsNumber()
    {
        return this.rows;
    }
    
    public int getColumnsNumber()
    {
        return this.columns;
    }
    
    public void addElement(int row, int column, Complex num)
    {
        this.matrix[row][column] = num;
    }
    
    public Complex getElement(int row, int column)
    {
        return this.matrix[row][column];
    }
    
    public static void addElement(ComplexMatrix matrix, int row, int column, Complex num)
    {
        matrix.matrix[row][column] = num;
    }
    
    public static Complex getElement(ComplexMatrix matrix, int row, int column)
    {
        return matrix.matrix[row][column];
    }
    
    /* Get determinant of any N × N Matrix using recursion */
    public static Complex getDeterminant(ComplexMatrix m)
    {
        // Declare determinant result as complex number, And initialize it using default constructor
        Complex result = new Complex();
        
        // If matrix 1 × 1
        if (m.rows == 1) // Check for rows same as columns as matrix is square
        {
            // Result is matrix[0][0]
            result = m.matrix[0][0];
            return result;
        }
        
        // If matrix reduced to 2 × 2 (We reduce any bigger matrix to 2 × 2) -- Recursion idea
        if (m.rows == 2)
        {
            // Get m[0][0] * m[1][1]
            Complex m00_Multiply_m11 = Complex.multiplyComplex(m.matrix[0][0], m.matrix[1][1]);
            
            // Get m[0][1] * m[1][0]
            Complex m01_Multiply_m10 = Complex.multiplyComplex(m.matrix[0][1], m.matrix[1][0]);
            
            // result = m[0][0] * m[1][1] - m[0][1] * m[1][0]
            result = Complex.subtractComplex(m00_Multiply_m11, m01_Multiply_m10);
            
            // Return result
            return result;
        }
        
        // If matrix more than N × N then let's reduce it to 2 × 2
        for (int i = 0; i < m.columns; i++)
        {
            // Create small Matrices
            ComplexMatrix temp = new ComplexMatrix(m.rows - 1, m.columns - 1);
            
            // Fill the small matrix (Algorithm... Trace it to understand it - Not written by me)
            for (int j = 1; j < m.rows; j++)
            {
                for (int k = 0; k < m.columns; k++)
                {
                    if (k < i)
                    {
                        temp.matrix[j - 1][k] = m.matrix[j][k];
                    }
                    else if (k > i)
                    {
                        temp.matrix[j - 1][k - 1] = m.matrix[j][k];
                    } 
                }
            }
            
            /* Now let's make recursion everytime: cofactor * sign * det(temp_matrix) */
            
            // First sign - Represent it as complex number (-1+0i or 1+0i)
            Complex sign = new Complex(Math.pow(-1, i), 0); // (-1)^i+j
            
            // m0i_Multiply_sign = matrix[0][i] * (-1)^i
            Complex m0i_Multiply_sign = Complex.multiplyComplex(m.matrix[0][i], sign);
            
            // multiplyResult = matrix[0][i] * (-1)^i * det(temp)
            Complex multiplyResult = Complex.multiplyComplex(m0i_Multiply_sign, ComplexMatrix.getDeterminant(temp));
            
            // result = result + multiplyResult
            // result = result + (matrix[0][i] * (-1)^i * det(temp))
            result = Complex.addComplex(result, multiplyResult);
        }
        
        // Return result --Finally :)--
        return result;
    }
}