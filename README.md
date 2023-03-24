# idea-debugger-tracing-bug
This repository was created for reproducing bug with debugger(tracer) in IntelliJ IDEA.

Add breakpoint in StubExample like this:
<img width="741" alt="image" src="https://user-images.githubusercontent.com/39978392/227555561-8d4c846f-a5b0-4037-a659-3fd3190d0f99.png">

Run test and you will fail in this method, but default answer must be null without failing into this method.
