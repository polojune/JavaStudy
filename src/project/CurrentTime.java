package project;

import java.time.LocalTime;

import javax.swing.JButton;

class CurrentTime {
	private CharStatus status;

	public CurrentTime(CharStatus status) {
		this.status = status;
	}

	public void runTime(JButton button) {
		new Thread(new Runnable() {

			@Override
			public void run() {
				while (true) {
					String currentTime = LocalTime.now().toString();
					currentTime = currentTime.split("[.]")[0];
					button.setText(currentTime);

					int second = LocalTime.now().getSecond();

					status.setHungry(status.getHungry() - 2);

					if (second % 3 == 0) {

						status.setFun(status.getFun() - 2);
					}

					if (second % 2 == 0)
						status.setSleep(status.getSleep() - 3);

					// Calendar c = Calendar.getInstance();
//					button.setText(c.get(Calendar.HOUR) + ":" + c.get(Calendar.MINUTE) + ":" + c.get(Calendar.SECOND));
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}

			}
		}).start();
	}

}
