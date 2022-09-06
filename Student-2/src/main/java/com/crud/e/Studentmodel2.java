package com.crud.e;

import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class Studentmodel2 {
		@Id
		private int sid;
		private String sname;
		private String sage;
		private String saddress;
		public int getSid() {
			return sid;
		}
		public void setSid(int sid) {
			this.sid = sid;
		}
		public String getSname() {
			return sname;
		}
		public void setSname(String sname) {
			this.sname = sname;
		}
		public String getSage() {
			return sage;
		}
		public void setSage(String sage) {
			this.sage = sage;
		}
		public String getSaddress() {
			return saddress;
		}
		public void setSaddress(String saddress) {
			this.saddress = saddress;
		}
		

}
