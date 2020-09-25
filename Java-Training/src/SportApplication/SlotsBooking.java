package SportApplication;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class SlotsBooking {

	public static void main(String[] args) {
		int noOfSlots = 0;
		List<String> sportList = new ArrayList<>();
		sportList.addAll(Arrays.asList("Badminton", " Football", "Box Cricket"));
		Map<String, List<String>> sportMap = new HashMap<>();
		sportMap.put("Badminton", new ArrayList<>(Arrays.asList("8am-9am", "9am-10am", "10am-11am", "11am-12pm",
				"12pm-1pm", "1pm-2pm", "2pm-3pm", "3pm-4pm", "4pm-5pm", "5pm-6pm")));
		sportMap.put("Football",
				new ArrayList<>(Arrays.asList("7:30am-8am", "8am-8:30am", "8:30am-9am", "9am-9:30am", "9:30am-10am",
						"10am-10:30pm", "10:30am-11am", "11am-11:30am", "11:30am-12pm", "12pm-12:30pm", "12:30pm-1pm", "1pm-1:30pm", "1:30pm-2pm",
						"2pm-2:30pm", "2:30pm-3pm", "3pm-3:30pm", "3:30pm-4pm", "4pm-4:30pm", "4:30pm-5pm", "5pm-5:30pm")));
		sportMap.put("Box Cricket", new ArrayList<>(Arrays.asList("7am-9pm", "9am-11am","11am-1pm", "1pm-3pm", "3pm-5pm")));

		List<List<String>> total = new ArrayList<>(sportMap.values());
		for (List<String> s : total) {
			noOfSlots += s.size();
		}

		while (noOfSlots > 0) {
			Scanner scn = new Scanner(System.in);
			System.out.println("Enter your Name: ");
			String name = scn.nextLine();
			System.out.println("List of Sports: " + sportMap.keySet());
			System.out.println("Select sport: ");
			String sportName = scn.nextLine();
			if (!sportMap.keySet().contains(sportName)) {
				System.out.println("Please select valid sport from " + sportMap.keySet());
				continue;
			}
			System.out.println("Timing for selected sport:" + sportMap.get(sportName));
			System.out.println("Select time: ");
			String sportTime = scn.nextLine();
			List<String> timeSlot = sportMap.get(sportName);
			boolean isRemoved = timeSlot.remove(sportTime);

			if (!isRemoved) {
				System.out.println("Sorry, this slot is not available or it is incorrect slot.");
			} else {
				sportMap.put(sportName, timeSlot);
				noOfSlots--;
				System.out.println("You have been sucessfully registred for " + sportName + " at " + sportTime);
			}

		}
	}

}
