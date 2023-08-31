package com.example.demo.modal;




import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Menu {
		@Id
		@GeneratedValue
		private int orderId;
		private String mainDish;
		private String starters;
		private String milkShakes;
		public int getOrderId() {
			return orderId;
		}
		public String getMainDish() {
			return mainDish;
		}
		public void setMainDish(String mainDish) {
			this.mainDish = mainDish;
		}
		public String getStarters() {
			return starters;
		}
		public void setStarters(String starters) {
			this.starters = starters;
		}
		public String getMilkShakes() {
			return milkShakes;
		}
		public void setMilkShakes(String milkShakes) {
			this.milkShakes = milkShakes;
		}
		public void setOrderId(int orderId) {
			this.orderId = orderId;
		}
		public Menu() {
			super();
			// TODO Auto-generated constructor stub
		}
		public Menu(int orderId, String mainDish, String starters, String milkShakes) {
			super();
			this.orderId = orderId;
			this.mainDish = mainDish;
			this.starters = starters;
			this.milkShakes = milkShakes;
		}
		
		
		
		
}

