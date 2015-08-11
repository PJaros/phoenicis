/*
 * Copyright (C) 2015 Markus Ebner
 *
 * This program is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation; either version 2 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License along
 * with this program; if not, write to the Free Software Foundation, Inc.,
 * 51 Franklin Street, Fifth Floor, Boston, MA 02110-1301 USA.
 */

package com.playonlinux.ui.impl.qt.mainwindow;

import com.trolltech.qt.gui.*;

import static com.playonlinux.core.lang.Localisation.translate;

/**
 * MenuBar of the MainWindow
 */
public class MainWindowMenuBar extends QMenuBar {
    private MainWindow mainWindow;

    private QMenu menuFile;
    private QMenu menuDisplay;
    private QMenu menuTools;
    private QMenu menuSettings;
    private QMenu menuHelp;
    private QMenu menuContact;

    private QAction actionRun;
    private QAction actionInstall;
    private QAction actionRemove;
    private QAction actionDonate;
    private QAction actionExit;
    private QAction actionSmall_Icons;
    private QAction actionMedium_Icons;
    private QAction actionLarge_Icons;
    private QAction actionVery_Large_Icons;
    private QAction actionWineVersions;
    private QAction actionLocalScript;
    private QAction actionConsole;
    private QAction actionCloseAll;
    private QAction actionDebugger;
    private QAction actionNetwork;
    private QAction actionAbout;
    private QAction actionSoftware;
    private QAction actionNews;
    private QAction actionForums;
    private QAction actionBugs;
    private QAction actionGooglePlus;
    private QAction actionTwitter;
    private QAction actionFacebook;

    private QActionGroup displayIconSizeGroup;



    public MainWindowMenuBar(MainWindow mainWindow){
        this.mainWindow = mainWindow;
        setupUi();
        retranslateUi();
    }
    
    private void setupUi(){
        /* MENU: FILE */
        menuFile = new QMenu(this);

        actionRun = new QAction(mainWindow);
        actionRun.setIcon(QIcon.fromTheme("document-open"));
        actionInstall = new QAction(mainWindow);
        actionInstall.setIcon(QIcon.fromTheme("list-add"));
        actionRemove = new QAction(mainWindow);
        actionRemove.setIcon(QIcon.fromTheme("edit-delete"));
        actionDonate = new QAction(mainWindow);
        actionExit = new QAction(mainWindow);
        actionExit.setIcon(QIcon.fromTheme("application-exit"));

        menuFile.addAction(actionRun);
        menuFile.addAction(actionInstall);
        menuFile.addAction(actionRemove);
        menuFile.addSeparator();
        menuFile.addAction(actionDonate);
        menuFile.addAction(actionExit);


        /* MENU: DISPLAY */
        menuDisplay = new QMenu(this);

        actionSmall_Icons = new QAction(mainWindow);
        actionSmall_Icons.setCheckable(true);
        actionMedium_Icons = new QAction(mainWindow);
        actionMedium_Icons.setCheckable(true);
        actionLarge_Icons = new QAction(mainWindow);
        actionLarge_Icons.setCheckable(true);
        actionVery_Large_Icons = new QAction(mainWindow);
        actionVery_Large_Icons.setCheckable(true);

        menuDisplay.addAction(actionSmall_Icons);
        menuDisplay.addAction(actionMedium_Icons);
        menuDisplay.addAction(actionLarge_Icons);
        menuDisplay.addAction(actionVery_Large_Icons);

        displayIconSizeGroup = new QActionGroup(menuDisplay);
        displayIconSizeGroup.addAction(actionSmall_Icons);
        displayIconSizeGroup.addAction(actionMedium_Icons);
        displayIconSizeGroup.addAction(actionLarge_Icons);
        displayIconSizeGroup.addAction(actionVery_Large_Icons);


        /* MENU: TOOLS */
        menuTools = new QMenu(this);

        actionWineVersions = new QAction(mainWindow);
        actionLocalScript = new QAction(mainWindow);
        actionConsole = new QAction(mainWindow);
        actionCloseAll = new QAction(mainWindow);
        actionDebugger = new QAction(mainWindow);

        menuTools.addAction(actionWineVersions);
        menuTools.addSeparator();
        menuTools.addAction(actionLocalScript);
        menuTools.addAction(actionConsole);
        menuTools.addAction(actionCloseAll);
        menuTools.addSeparator();
        menuTools.addAction(actionDebugger);


        /* MENU: SETTINGS */
        menuSettings = new QMenu(this);

        actionNetwork = new QAction(mainWindow);
        actionNetwork.setIcon(QIcon.fromTheme("network-wired"));

        menuSettings.addAction(actionNetwork);


        /* MENU: HELP */
        menuHelp = new QMenu(this);

        actionAbout = new QAction(mainWindow);
        actionAbout.setIcon(QIcon.fromTheme("help-about"));
        actionSoftware = new QAction(mainWindow);
        actionNews = new QAction(mainWindow);
        actionForums = new QAction(mainWindow);
        actionBugs = new QAction(mainWindow);

        menuHelp.addAction(actionAbout);
        menuHelp.addSeparator();
        menuHelp.addAction(actionSoftware);
        menuHelp.addAction(actionNews);
        menuHelp.addAction(actionForums);
        menuHelp.addAction(actionBugs);


        /* MENU: CONTACT */
        menuContact = new QMenu(this);

        actionGooglePlus = new QAction(mainWindow);
        actionTwitter = new QAction(mainWindow);
        actionFacebook = new QAction(mainWindow);

        menuContact.addAction(actionTwitter);
        menuContact.addAction(actionGooglePlus);
        menuContact.addAction(actionFacebook);



        addAction(menuFile.menuAction());
        addAction(menuDisplay.menuAction());
        addAction(menuTools.menuAction());
        addAction(menuSettings.menuAction());
        addAction(menuHelp.menuAction());
        addAction(menuContact.menuAction());
    }

    private void retranslateUi(){
        /* MENU: FILE */
        menuFile.setTitle(translate("File"));
        actionRun.setText(translate("Run"));
        actionInstall.setText(translate("Install"));
        actionRemove.setText(translate("Remove"));
        actionDonate.setText(translate("Donate"));
        actionExit.setText(translate("Exit"));

        /* MENU: DISPLAY */
        menuDisplay.setTitle(translate("Display"));
        actionSmall_Icons.setText(translate("Small Icons"));
        actionMedium_Icons.setText(translate("Medium Icons"));
        actionLarge_Icons.setText(translate("Large Icons"));
        actionVery_Large_Icons.setText(translate("Very Large Icons"));

        /* MENU: TOOLS */
        menuTools.setTitle(translate("Tools"));
        actionWineVersions.setText(translate("Manage Wine versions"));
        actionLocalScript.setText(translate("Run a local script"));
        actionConsole.setText(translate("PlayOnLinux console"));
        actionCloseAll.setText(translate("Close all PlayOnLinux software"));
        actionDebugger.setText(translate("PlayOnLinux debugger"));

        /* MENU: SETTINGS */
        menuSettings.setTitle(translate("Settings"));
        actionNetwork.setText(translate("Network"));

        /* MENU: HELP */
        menuHelp.setTitle(translate("Help"));
        actionAbout.setText(translate("About"));
        actionSoftware.setText(translate("Supported Software"));
        actionNews.setText(translate("News"));
        actionForums.setText(translate("Forums"));
        actionBugs.setText(translate("Bugs"));

        /* MENU: CONTACT */
        menuContact.setTitle(translate("Contact"));
        actionGooglePlus.setText(translate("Google+"));
        actionTwitter.setText(translate("Twitter"));
        actionFacebook.setText(translate("Facebook"));
    }
    
}
