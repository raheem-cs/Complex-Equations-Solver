# Complex Equations Solver

####  What is this?

- This is a JavaFX software developed by me Raheem Elsayed for solving 2×2 or 3×3 complex linear equations. Long time ago i writen Visual Basic software to solve 2×2 complex linear equations but when i learned java i decided to make it with JavaFX and extend it to 3×3 and will extend more when get time.

####  Is this software useful?

- This can be useful in case you are studying sinusoids and phasors in electric circuits, this will provide you a simple easy way to solve these equations. As many as i solved electric circuits (using node, mesh ..etc) i can tell you that the max maybe you face is a system of 3×3 complex linear equations.

####  Is it easy to use?

- I think yes, you just need to enter real, imaginary parts and it's all. It's very easy to use.

#### Building & Version:

- You can build this program on any IDE, i used NetBeans to build current one in this repository.
- We can consider the version of this software: 1.0.0

#### Support:

- I'll support this software, and maintenance it. Don't hesitate to open issue if you found any bug/problem. Also all good ideas are welcomed :)

#### EXE:

- Download: [Complex Equations Solver.exe](https://www.dropbox.com/s/vowvjlp3wyyvprd/Complex%20Equations%20Solver.exe?dl=1 "Complex Equations Solver.exe")\
Make sure [JVM](https://www.java.com/en/download/manual.jsp/ "JVM") installed on your OS so this .EXE works.\
I used [Launch4j](https://sourceforge.net/projects/launch4j/ "Launch4j") to generate this EXE.

#### How to use?

- Simply you will need to enter real part then press Enter (Enter ↵ will go to next field) then enter the imaginary part and then press enter to go to next field and like this fill all required fields. Then press solve.

- Example of this if we had these two equations:
> `(3+2i)X + (3-4i)Y = (-2i)`\
> `(3)   X + (-1i) Y = (-4-2i)`

- You should enter them like in this photo:
> <img src="https://www.gulf-up.com/i/00071/walmpaevrire.png" width="250">

#### Verify with Matlab:

- Here i take arbitrary equations and solved them with Matlab and compared them with my software and its matched matlab results.
The two matlab scripts: [twoequations.m](https://www.dropbox.com/s/qr8qtyzduluagpy/twoequations.m?dl=1 "twoequations.m"), [threeequations.m](https://www.dropbox.com/s/26ta0ajwukw16u0/threeequations.m?dl=1 "threeequations.m")

- OK here matlab results:
> <img src="https://www.gulf-up.com/i/00071/dytfu6fvex22.png" width="250">
> <img src="https://www.gulf-up.com/i/00071/vqhvhj6s3igd.png" width="250">

- And here our software results:
> <img src="https://www.gulf-up.com/i/00071/fjs8vcuf3b6q.png" width="250">
> <img src="https://www.gulf-up.com/i/00071/0em2pfjjhvvk.png" width="250">

#### UML Diagram for Complex, ComplexMatrix classes:

- You can use these classes in any other software if you need. I think these two classes have good and enough things for dealing with complex numbers. And here is the UML diagrams for these two classes:
> <img src="https://www.gulf-up.com/i/00071/j15hhhi944h6.png" width="250">
> <img src="https://www.gulf-up.com/i/00071/jtut96tqurhw.png" width="250">

#### Hidden feature:

- After you enter the value in the text area field, press enter key and it will go to the next field ;). This feature suggested by one my friend (Abdelrahman Gamal - He inspired me with good ideas but was lazy and didn't this code with me) thanks to him.

#### Can we extent this to 4×4, 5×5...?:

- Yes we can. Will be same idea like 3×3 and 2×2. I made only two modes as no much time i own for this project :D

#### Finally:

- You are allowed to edit my code, rebuild it or publish it anywhere but state the source (this github). Thanks :)
