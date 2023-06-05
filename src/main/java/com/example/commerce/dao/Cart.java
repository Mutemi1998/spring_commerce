// package com.example.commerce.dao;

// import jakarta.persistence.Entity;
// import jakarta.persistence.GeneratedValue;
// import jakarta.persistence.GenerationType;
// import jakarta.persistence.Id;
// import jakarta.persistence.OneToMany;
// import jakarta.persistence.Table;
// import java.util.List;

// @Entity
// @Table(name = "Cart")
// public class Cart {
//     @Id
//     @GeneratedValue(strategy = GenerationType.IDENTITY)
//     private Long id;

//     @OneToMany(mappedBy = "cart")
//     private List<Product> products;

//     private String customerName;

//     private String shippingAddress;

//     private double totalPrice;

//     private boolean isPaid;

//     private boolean isShipped;

//     public Cart() {}

//     public Cart(Long id, List<Product> products, String customerName, String shippingAddress, double totalPrice,
//                 boolean isPaid, boolean isShipped) {
//         this.id = id;
//         this.products = products;
//         this.customerName = customerName;
//         this.shippingAddress = shippingAddress;
//         this.totalPrice = totalPrice;
//         this.isPaid = isPaid;
//         this.isShipped = isShipped;
//     }

//     public Long getId() {
//         return id;
//     }

//     public void setId(Long id) {
//         this.id = id;
//     }

//     public List<Product> getProducts() {
//         return products;
//     }

//     public void setProducts(List<Product> products) {
//         this.products = products;
//     }

//     public String getCustomerName() {
//         return customerName;
//     }

//     public void setCustomerName(String customerName) {
//         this.customerName = customerName;
//     }

//     public String getShippingAddress() {
//         return shippingAddress;
//     }

//     public void setShippingAddress(String shippingAddress) {
//         this.shippingAddress = shippingAddress;
//     }

//     public double getTotalPrice() {
//         return totalPrice;
//     }

//     public void setTotalPrice(double totalPrice) {
//         this.totalPrice = totalPrice;
//     }

//     public boolean isPaid() {
//         return isPaid;
//     }

//     public void setPaid(boolean paid) {
//         isPaid = paid;
//     }

//     public boolean isShipped() {
//         return isShipped;
//     }

//     public void setShipped(boolean shipped) {
//         isShipped = shipped;
//     }

//     @Override
//     public String toString() {
//         return "Cart{" +
//                 "id=" + id +
//                 ", products=" + products +
//                 ", customerName='" + customerName + '\'' +
//                 ", shippingAddress='" + shippingAddress + '\'' +
//                 ", totalPrice=" + totalPrice +
//                 ", isPaid=" + isPaid +
//                 ", isShipped=" + isShipped +
//                 '}';
//     }
// }