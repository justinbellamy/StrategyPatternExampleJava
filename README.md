# Strategy Pattern Example in Java

A simple design pattern example.

**Concept:** A creational pattern. The Strategy Pattern is essentially a way to provide multiple ways to perform some sort of similar action. I've used the Strategy Pattern in projects to handle actions spanning  login authorization from multiple social networks, to multiple payment authorization types on payment processing systems.

The concept is that we know we want to do something, such as an authorization (login/process payment), but the algorithm by which this takes place (Facebook vs. Twitter / Credit Card vs. Checking Account) needs to be decoupled and managed at an object level from the calling code.

**Pros:** Allows for incorporating new behavior in a loosely coupled way within the context entity.

**Cons:** The client/calling code must be aware of the various strategies that are available.

**Example:** In the following example, we exhibit how the Strategy Pattern can be used to distinguish the amount of calories that can be burned via different exercises at a given gym (Swimming vs Jogging). In the future, we could add other ways to exercise at our gym (perhaps Cycling?). Given the same 30 minutes of exercise time, we can see that we burn a different amount of calories from each activity.

We accomplish the Strategy Pattern by:

* Creating the **Strategy Interface** `ExerciseStrategy` and defining the shared activity type. In this case, it's the method `exercise()`.
* We create **Concrete Strategies** `SwimmingStrategy` and `JoggingStrategy`.
* We create a **Context** named `ExerciseContext` which has a simple `executeStrategy()` method that is called when we want to literally execute the strategy.
* Last, in our `main()` function, all we need to do is tell the **Context** what **Strategy** we want to use and it performs the actions in a clean, elegant manner.