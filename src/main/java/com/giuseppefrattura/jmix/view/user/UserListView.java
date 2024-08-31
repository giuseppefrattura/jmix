package com.giuseppefrattura.jmix.view.user;

import com.giuseppefrattura.jmix.entity.User;
import com.giuseppefrattura.jmix.view.main.MainView;
import com.vaadin.flow.router.Route;
import io.jmix.flowui.view.*;

@Route(value = "users", layout = MainView.class)
@ViewController("gf_User.list")
@ViewDescriptor("user-list-view.xml")
@LookupComponent("usersDataGrid")
@DialogMode(width = "64em")
public class UserListView extends StandardListView<User> {
}