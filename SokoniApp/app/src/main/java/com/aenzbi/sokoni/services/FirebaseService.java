package com.aenzbi.sokoni.services;

import com.google.firebase.firestore.*;

import java.util.Map;

public class FirebaseService {

    static FirebaseFirestore db = FirebaseFirestore.getInstance();

    public static void getProducts(OnSuccessListener<QuerySnapshot> listener) {
        db.collection("products").get().addOnSuccessListener(listener);
    }

    public static void createOrder(Map<String, Object> order) {
        db.collection("orders").add(order);
    }
}
