package by.metelsky.basicofoop.task4.view;

import by.metelsky.basicofoop.task4.service.ServiceProvider;
import by.metelsky.basicofoop.task4.service.TreasureService;
import by.metelsky.basicofoop.task4.service.impl.TreasureServiceImpl;
import by.metelsky.basicofoop.task4.view.impl.ViewImplem;

public class ViewProvider {
	private static final ViewProvider instance = new ViewProvider();
	
	private ViewProvider() {
		
	}
	public static ViewProvider getInstance() {
		return instance;
	}
	private View view = new ViewImplem();

	public View getView() {
		return view;
	}

}
