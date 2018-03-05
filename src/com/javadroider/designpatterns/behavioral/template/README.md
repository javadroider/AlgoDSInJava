Template Method is a behavioral design pattern and it's used to create a method stub and deferring some of the steps of implementation to the subclasses. 
Template method defines the steps to execute an algorithm and it can provide default implementation that might be common for all or some of the subclasses.

Suppose we want to provide an algorithm to build a house. The steps need to be performed to build a house are – 
- Building foundation
- Building pillars
- Building walls 
- Building windows

The important point is that the we can’t change the order of execution because we can’t build windows before building the foundation. So in this case we can create a template method that will use different methods to build the house.
