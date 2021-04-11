package com.class28.interfaces;

public interface Person {
    void sleep();
    void eat();
}
interface employee {
    void work();
}
interface SyntaxEmployee extends Person, employee {
    void work();
}
