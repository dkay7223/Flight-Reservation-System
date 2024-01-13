package Factory;

import Catalogue.Catalogue;
import Catalogue.UserCatalogue;
import User.User;

public class UserFactory implements Factory{

	public static Catalogue getCatalogueInstance() {
		// TODO Auto-generated method stub
		return UserCatalogue.getInstance();
	}

	@Override
	public Object getInstance() {
		// TODO Auto-generated method stub
		return new User();
	}
	
	
	
}
