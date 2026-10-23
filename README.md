# 🚀 Distributed Lovable Clone

An AI-powered application development platform inspired by [Lovable](https://lovable.dev), designed to transform natural-language prompts into application code and provide an environment to manage, generate, and preview projects.

This project explores building a scalable, cloud-native application using Java, Spring Boot, Spring AI, React, and distributed microservices.

## ✨ Features

- 🤖 **AI-Powered Code Generation** — Generate application code from natural-language prompts.
- 💬 **AI Chat Integration** — Interact with AI through chat-based workflows and events.
- 👤 **Authentication & Authorization** — Secure access using Spring Security and JWT.
- 📁 **Project & Workspace Management** — Manage projects, members, and workspaces.
- 💳 **Payment Integration** — Integrate Stripe for subscription and payment workflows.
- 🗂️ **File Management** — Store and manage generated project files using MinIO.
- ⚡ **Distributed Architecture** — Separate application responsibilities into independent microservices.
- 📨 **Event-Driven Communication** — Use Apache Kafka for communication between services.
- 🔄 **Saga Design Pattern** — Explore coordination of distributed transactions.
- 🖥️ **Code Execution & Preview** — Build isolated code execution environments and application preview URLs using Kubernetes.
- ☁️ **Cloud Deployment** — Deploy the application to Google Kubernetes Engine (GKE).
- ⚙️ **CI/CD Automation** — Automate build and deployment workflows using GitHub Actions.

## 🛠️ Tech Stack

| Category | Technologies |
|---|---|
| Backend | Java, Spring Boot |
| AI Integration | Spring AI, Tool Calling |
| Frontend | React |
| Security | Spring Security, JWT |
| Database & Storage | SQL database, MinIO |
| Messaging | Apache Kafka |
| Architecture | Microservices, API Gateway, Saga Pattern |
| Payments | Stripe |
| Containerization | Docker |
| Orchestration | Kubernetes |
| Cloud | Google Kubernetes Engine (GKE) |
| CI/CD | GitHub Actions |

## 🏗️ Architecture Overview

The application is designed around a distributed microservices architecture, where each service handles a specific business responsibility.

- **API Gateway:** Provides a central entry point for incoming requests.
- **Account Service:** Handles account-related operations.
- **Workspace Service:** Manages workspaces and project organization.
- **Intelligence Service:** Handles AI-related workflows and code generation.
- **Kafka:** Supports asynchronous communication between services.
- **AI Code Execution System:** Uses containerized execution environments to run generated application code.
- **Kubernetes:** Supports deployment, orchestration, and isolated execution environments.

The architecture is developed incrementally, with a focus on scalability, modularity, and maintainability.

## 🔄 Application Workflow

1. A user creates or selects a workspace.
2. The user provides a natural-language prompt describing an application.
3. The AI service processes the prompt and generates code.
4. Generated files are stored and organized within the project.
5. The code execution environment prepares the application for preview.
6. The user can interact with the generated application through a preview URL.

*The workflow and available capabilities depend on the implementation completed so far.*

## 📚 Key Learning Areas

- Building RESTful APIs with Spring Boot
- Implementing authentication and authorization
- Integrating AI models using Spring AI
- Designing microservices and API gateways
- Implementing event-driven communication with Kafka
- Understanding distributed transactions and the Saga pattern
- Containerizing applications with Docker
- Deploying services using Kubernetes and GKE
- Automating development workflows with GitHub Actions
- Building scalable, cloud-native backend systems

## 🚧 Project Status

This project is being developed incrementally while exploring Spring Boot, AI integration, distributed systems, and cloud-native technologies.

Features and architecture will evolve as development progresses.

## 🎯 Objective

To gain hands-on experience building a production-oriented, AI-powered application platform while strengthening backend development, distributed systems, system design, and cloud deployment skills.

---

⭐ If you find this project interesting, feel free to explore the repository and follow its development.
