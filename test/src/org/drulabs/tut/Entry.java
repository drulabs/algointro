package org.drulabs.tut;

import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.util.Arrays;
import java.util.Collections;
import java.util.Enumeration;

public class Entry {

	public static void main(String[] args) {

		try {
			Enumeration<NetworkInterface> nets = NetworkInterface.getNetworkInterfaces();
			int i = 0;
			for (NetworkInterface netIf : Collections.list(nets)) {
				System.out.println(String.format(++i + "#Display name: %s", netIf.getDisplayName()));
				System.out.println(String.format("is virtual?: %s", netIf.isVirtual()));
				System.out.println(String.format("is loopback?: %s", netIf.isLoopback()));
				System.out.println(String.format("is up and running?: %s", netIf.isUp()));
				System.out.println(String.format("supports multicast?: %s", netIf.supportsMulticast()));
				displayAddresses(false, netIf);

				// List<NetworkInterface> subNIs =
				// Collections.list(netIf.getSubInterfaces());
				// for (NetworkInterface subni : subNIs) {
				// System.out.println("sub interfaces...");
				// System.out.println(String.format("\t" + (++i) + "#Display
				// name: %s", subni.getDisplayName()));
				// System.out.println(String.format("\t" + "is virtual?: %s",
				// subni.isVirtual()));
				// System.out.println(String.format("\t" + "is loopback?: %s",
				// subni.isLoopback()));
				// System.out.println(String.format("\t" + "is up and running?:
				// %s", subni.isUp()));
				// System.out.println(String.format("\t" + "supports multicast?:
				// %s", subni.supportsMulticast()));
				// displayAddresses(true, netIf);
				// }

				System.out.println();
			}
		} catch (SocketException e) {
			e.printStackTrace();
		}
	}

	static void displayAddresses(boolean isSub, NetworkInterface netIf) throws SocketException {
		Enumeration<InetAddress> niaddresses = netIf.getInetAddresses();

		String space = isSub ? "\t" : "";

		for (InetAddress inetAddr : Collections.list(niaddresses)) {
			System.out.println(String.format(space + "\tInetAddress: %s", inetAddr.getHostAddress()));
			System.out.println(String.format(space + "\tInetAddress host name: %s", inetAddr.getHostName()));
			System.out.println(
					String.format(space + "\tInetAddress host name: %s", Arrays.toString(inetAddr.getAddress())));
		}
	}

}
