package com.xworkz.inheitance.boot;

import com.xworkz.inheitance.child.invitation.WeddingInvitation;
import com.xworkz.inheitance.constant.CardType;

public class InvitationRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WeddingInvitation winvite=new WeddingInvitation(30, 5, CardType.CARD);
winvite.display();
	}

}
