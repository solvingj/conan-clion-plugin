package conan.commands;

import com.intellij.openapi.project.Project;
import conan.commands.process_adapters.ProfileListProcessAdapter;
import conan.profiles.ConanProfile;

import java.util.List;

/**
 * Get all Conan profiles.
 * Run "conan profile list"
 *
 * Created by Yahav Itzhak on Feb 2018.
 */
public class ProfileList extends ConanCommandBase {

    public ProfileList(Project project) {
        super(project, "profile", "list");
    }

    public void run_sync(List<ConanProfile> profiles) {
        super.run_sync(new ProfileListProcessAdapter(profiles));
    }

}
