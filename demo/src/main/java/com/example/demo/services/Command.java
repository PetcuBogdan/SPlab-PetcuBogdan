package com.example.demo.services;

public interface Command<T> {
    T execute();
}
