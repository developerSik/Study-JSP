package com.mybatis.vo;

public class MemberVO {
	
	private Long memberId;
	private String memberName;
	private int memberAge;
	
	public MemberVO() {;}

	public MemberVO(Long memberId, String memberName, int memberAge) {
		super();
		this.memberId = memberId;
		this.memberName = memberName;
		this.memberAge = memberAge;
	}

	public Long getMemberId() {
		return memberId;
	}

	public void setMemberId(Long memberId) {
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
		result = prime * result + memberAge;
		result = prime * result + ((memberId == null) ? 0 : memberId.hashCode());
		result = prime * result + ((memberName == null) ? 0 : memberName.hashCode());
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
		if (memberAge != other.memberAge)
			return false;
		if (memberId == null) {
			if (other.memberId != null)
				return false;
		} else if (!memberId.equals(other.memberId))
			return false;
		if (memberName == null) {
			if (other.memberName != null)
				return false;
		} else if (!memberName.equals(other.memberName))
			return false;
		return true;
	}
	
	

}
