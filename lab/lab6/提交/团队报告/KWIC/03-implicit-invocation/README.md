# KWIC: Implicit Invocation

This implementation uses implicit invocation (Observer pattern) with abstract data types.
There is main class [KWIC](https://github.com/klimesf/kwic/blob/master/03-implicit-invocation/src/cz/cvut/fel/ass/kwic/implicitInvocation/KWIC.java)
with main method, and then there are classes for each module (
[Input](https://github.com/klimesf/kwic/blob/master/03-implicit-invocation/src/cz/cvut/fel/ass/kwic/implicitInvocation/Input.java),
[CircularShift](https://github.com/klimesf/kwic/blob/master/03-implicit-invocation/src/cz/cvut/fel/ass/kwic/implicitInvocation/CircularShift.java),
[Alphabetizer](https://github.com/klimesf/kwic/blob/master/03-implicit-invocation/src/cz/cvut/fel/ass/kwic/implicitInvocation/Alphabetizer.java),
[Output](https://github.com/klimesf/kwic/blob/master/03-implicit-invocation/src/cz/cvut/fel/ass/kwic/implicitInvocation/Output.java)).
There is also a class for wrapping the [lines storage](https://github.com/klimesf/kwic/blob/master/03-implicit-invocation/src/cz/cvut/fel/ass/kwic/implicitInvocation/Lines.java), which is observable.

The program works with [input text from the article](https://github.com/klimesf/kwic/blob/master/03-implicit-invocation/input.txt)
and produces [alphabetically sorted circular shifts of each line](https://github.com/klimesf/kwic/blob/master/03-implicit-invocation/output.txt).
