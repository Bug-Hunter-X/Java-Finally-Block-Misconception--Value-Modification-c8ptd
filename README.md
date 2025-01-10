# Java Finally Block Misconception

This repository demonstrates a subtle but common misconception about the `finally` block in Java's exception handling. Many developers assume that changes made to variables within the `finally` block will affect the values of those variables in the `try` block.  This is incorrect. Changes in `finally` only take effect *after* the `try` block completes (successfully or unsuccessfully). 

The `UncommonBug.java` file shows the incorrect assumption, while `UncommonBugSolution.java` provides the corrected version.  Note the difference in output.
