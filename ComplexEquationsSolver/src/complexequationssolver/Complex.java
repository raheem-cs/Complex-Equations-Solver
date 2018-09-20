package complexequationssolver;

public class Complex
{
    // Data Fields
    private double real, imag;
    
    // Constructors
    public Complex()
    {
        // Empty Constructor
    }
    
    public Complex(double real, double imag)
    {
        this.real = real;
        this.imag = imag;
    }
    
    // Methods
    public double getReal()
    {
        return this.real;
    }
    
    public double getImag()
    {
        return this.imag;
    }
    
    public double getMag()
    {
        return Math.sqrt(Math.pow(real, 2) + Math.pow(imag, 2));
    }
    
    public Complex getConj()
    {
        return new Complex(this.real, this.imag * -1);
    }
    
    public double getPhase()
    {
        return Math.toDegrees(Math.atan(this.imag/this.real));
    }
    
    public void setReal(double real)
    {
        this.real = real;
    }
    
    public void setImag(double imag)
    {
        this.imag = imag;
    }
    
    public void setComplex(double real, double imag)
    {
        this.real = real;
        this.imag = imag;
    }
    
    public static Complex addComplex(Complex num1, Complex num2)
    {
        Complex addResult = new Complex();
        
        addResult.real = num1.real + num2.real;
        addResult.imag = num1.imag + num2.imag;
        
        return addResult;
    }
    
    public static Complex subtractComplex(Complex num1, Complex num2)
    {
        Complex subtractResult = new Complex();
        
        subtractResult.real = num1.real - num2.real;
        subtractResult.imag = num1.imag - num2.imag;
        
        return subtractResult;
    }
    
    public static Complex multiplyComplex(Complex num1, Complex num2)
    {
        Complex multiplyResult = new Complex();
        
        multiplyResult.real = (num1.real * num2.real) - (num1.imag * num2.imag);
        multiplyResult.imag = (num1.real * num2.imag) + (num1.imag * num2.real);
        
        return multiplyResult;
    }
    
    public static Complex divideComplex(Complex num1, Complex num2)
    {
        Complex divideResult = new Complex();
        Complex multiply = multiplyComplex(num1, num2.getConj());
        
        divideResult.real = (multiply.real) / (Math.pow(num2.real, 2) + Math.pow(num2.imag, 2));
        divideResult.imag = (multiply.imag) / (Math.pow(num2.real, 2) + Math.pow(num2.imag, 2));

        return divideResult;
    }
    
    @Override
    public String toString()
    {
        if (this.imag > 0)
        {
            if (this.real == 0)
            {
                return this.imag + "i";
            }
            else
            {
                return this.real + "+" + this.imag + "i";
            }
        }
        else if (this.imag == 0)
        {
            return Double.toString(this.real);
        }
        else
        {
            if (this.real == 0)
            {
                return Double.toString(this.imag) + "i";
            }
            else
            {
                return this.real + Double.toString(this.imag) + "i";
            }
        }
    }
}