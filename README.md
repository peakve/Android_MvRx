# Android_MvRx
mvrx

MvRx（读作“mavericks”）帮助Android开发人员实现常见的特性，并把他们的应用与OS恰当地集成。MvRx使用Kotlin编写，支撑着Airbnb所有的Android开发。

MvRx提供了一种反应式应用开发框架，旨在减少开发人员需要编写的代码，按照Peal的说法，减少多达50%到70%。该框架以下面四个基本概念为基础：

不可变状态，用于渲染UI。状态属性是Observable<T>的实例，因而可以在它们变化时用于触发特定的操作。
  
视图，每当相关状态的属性发生变化就会进行渲染。视图可以看作是临时对象，每当它们的invalidate方法被调用时就会创建。视图可以关联到Fragments，响应Android Lifecycle。每个视图关联到一个或多个ViewModel。

ViewModel，拥有状态，用于处理应用的业务逻辑。ViewModel是唯一可以使用setState修改状态的对象，使用Kotlin的复制机制从当前状态返回一个新状态。ViewModel可以使用withState块访问它们的状态，保证所有挂起的setState操作完成后才会执行。如上所述，你可以订阅ViewModel中的状态变化。

Async操作，可以关联到State属性，以便每次状态属性发生变化时，可以执行相关操作。Async是一个密封类，有4个子类：Uninitialized、Loading、Success和Fail。
