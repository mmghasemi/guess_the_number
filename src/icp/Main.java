package icp;

import icp.aplication.SessionManager;

/**
 * Hlavn� spou�t�c� t��da aplikace.
 */
public class Main {

	public static void main(String[] args) {
		new SessionManager().startGui();
	}
}