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
		private int dquantity;
		private String starters;
		private int squantity;
		private String milkShakes;
		private int mquantity;
		public Menu() {
			super();
			// TODO Auto-generated constructor stub
		}
		public Menu(int orderId, String mainDish, int dquantity, String starters, int squantity, String milkShakes,
				int mquantity) {
			super();
			this.orderId = orderId;
			this.mainDish = mainDish;
			this.dquantity = dquantity;
			this.starters = starters;
			this.squantity = squantity;
			this.milkShakes = milkShakes;
			this.mquantity = mquantity;
		}
		public int getOrderId() {
			return orderId;
		}
		public void setOrderId(int orderId) {
			this.orderId = orderId;
		}
		public String getMainDish() {
			return mainDish;
		}
		public void setMainDish(String mainDish) {
			this.mainDish = mainDish;
		}
		public int getDquantity() {
			return dquantity;
		}
		public void setDquantity(int dquantity) {
			this.dquantity = dquantity;
		}
		public String getStarters() {
			return starters;
		}
		public void setStarters(String starters) {
			this.starters = starters;
		}
		public int getSquantity() {
			return squantity;
		}
		public void setSquantity(int squantity) {
			this.squantity = squantity;
		}
		public String getMilkShakes() {
			return milkShakes;
		}
		public void setMilkShakes(String milkShakes) {
			this.milkShakes = milkShakes;
		}
		public int getMquantity() {
			return mquantity;
		}
		public void setMquantity(int mquantity) {
			this.mquantity = mquantity;
		}
		
		

}

