package Core.Utilities.Concrete;

import Core.Utilities.Abstract.IRegexService;
import OuterPackages.Validators.Regex;

public class RegexManager implements IRegexService {

    public boolean isValid(String email){
        return Regex.validate(email);
    }

}
