package com.gkelly.spark;

import static spark.Spark.*;

public class Main {
    public static void main(String[] args) {
        get("/hello", (req, res) -> "Hello World");
        get("/", (req, res) -> {res.redirect("/hello", 301); return "";});
    }
}

