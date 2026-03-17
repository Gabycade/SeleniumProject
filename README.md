This repository serves as a comprehensive automation environment, integrating various tools to simulate a modern CI/CD pipeline and containerized testing infrastructure.

## Tech Stack & Tools Installed

I have successfully configured the following technologies within this environment:

Selenium (Java)**: Core framework for web browser automation.
Maven**: Dependency management and project build lifecycle.
TypeScript: Installed via NPM to support typed scripting.
Playwright: Configured for modern, fast end-to-end testing.
Docker: Used for service containerization.
Jenkins: Local CI/CD server setup for automated build execution.

Project Roadmap & Status
MSSQL Database Initialization**: Docker is installed, but the MSSQL instance is pending initialization and schema setup.

Getting Started

Currently, tests can be executed via IntelliJ or through Maven:
```bash
mvn test

[INFO]
[INFO] -------------------------------------------------------
[INFO]  T E S T S
[INFO] -------------------------------------------------------
[INFO] Running ChromeTest
[INFO] Tests run: 0, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.003 s -- in ChromeTest
[INFO]
[INFO] Results:
[INFO]
[INFO] Tests run: 0, Failures: 0, Errors: 0, Skipped: 0
[INFO]
[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------
[INFO] Total time:  9.615 s
[INFO] Finished at: 2026-03-18T00:35:49+02:00
[INFO] ------------------------------------------------------------------------
