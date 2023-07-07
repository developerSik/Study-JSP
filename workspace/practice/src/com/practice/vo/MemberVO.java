package com.practice.vo;

public class MemberVO {
	private long memberId;
	private String memberName;
	private int memberAge;
	
	public MemberVO() {;}

	public long getMemberId() {
		return memberId;
	}

	public void setMemberId(long memberId) {
		this.memberId = memberId;
	}

	public String getMemberName() {
		return memberName;
	}

	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}

	public int getMemberAge() {
		return memberAge;
	}

	public void setMemberAge(int memberAge) {
		this.memberAge = memberAge;
	}

	@Override
	public String toString() {
		return "MemberVO [memberId=" + memberId + ", memberName=" + memberName + ", memberAge=" + memberAge + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (memberId ^ (memberId >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		MemberVO other = (MemberVO) obj;
		if (memberId != other.memberId)
			return false;
		return true;
	}
	
	
	
	
}
