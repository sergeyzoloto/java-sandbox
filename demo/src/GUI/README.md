# GUI

Graphical User Interface (GUI) allows users to interact with electronic devices through graphical icons and visual indicators, as opposed to text-based interfaces, typed command labels, or text navigation.

## JFrame

`JFrame` is a class in the Java Swing library for creating and managing windows. It serves as the main window where components like panels, buttons, labels, etc., are added to create a GUI.

## JLabel

`JLabel` is a component in the Java Swing library that displays a short string or an image icon. JLabels are used to label other components or to provide a short message or image on a GUI.

## JPanel

`JPanel` is a generic lightweight container in the Java Swing library. It is used to group other components together or to provide a specific layout for arranging components within a GUI.

## JButton

`JButton` is a push button component from the Java Swing library that can trigger a certain action when clicked by the user. It can display text, an image, or both.

## Layout Manager

Layout Managers in Java Swing are used to arrange components in a particular manner within their container. They define the layout for containers such as panels and frames.

### BorderLayout

`BorderLayout` arranges components to fit in five regions: north, south, east, west, and center. Each region can contain only one component, and it is particularly useful for setting up the general structure of a GUI.

### FlowLayout

`FlowLayout` is a layout manager that places components in a row, aligned at their center. If the horizontal space in the container is too small, the FlowLayout class uses the next available row.

### GridLayout

`GridLayout` arranges components in a rectangular grid, where all cells are of equal size. Each component in the container is forced to be the same size and is laid out using the same number of rows and columns.

## JLayeredPane

`JLayeredPane` allows the developer to layer multiple components on top of each other, creating a depth effect. It is useful for situations where components need to overlap or when z-ordering is important.

## Open a new GUI window

To open a new GUI window, you typically create a new `JFrame` instance and set it to visible. This new window can then host various UI components.

## JOptionPane for popup windows

`JOptionPane` provides a simple way to pop up standard dialog boxes that prompt users for a value or inform them of something. It can be used for error messages, warnings, confirmations, and simple inputs.

## Text Field

A `JTextField` allows the editing of a single line of text. It can be used to gather inputs from the user like names, settings, and other data.

## Checkbox with icons

Checkboxes with icons allow users to select one or more options from a set, each option accompanied by an icon for visual representation. This enhances the user interface by making it more intuitive and visually appealing.

## Radio Buttons

Radio buttons enable a user to select one option from a set of mutually exclusive options. Each option is represented by a radio button.

## JComboBox for dropdown

`JComboBox` is a component that combines a button or editable field and a drop-down list, allowing users to select one item from a list of options.

## JSlider

`JSlider` is a component that lets the user graphically select a value by sliding a knob within a bounded interval.

## ProgressBar

A ProgressBar visually displays the progress of an operation by filling a bar to represent the completed percentage of the work.

## MenuBar

A MenuBar is a graphical user interface component that displays a list of menus available for selection in an application, typically at the top of the window.

## JFileChooser: show dialog

`JFileChooser` is a simple mechanism for the user to choose a file. It can be used to open or save files through a dialog window.

## JColorChooser

`JColorChooser` is a GUI mechanism that allows a user to choose colors from a palette in a dialog window.

## KeyListener

`KeyListener` is an interface in Java that listens for keys pressed, released, or typed on a component. It is commonly used to handle keyboard events, allowing developers to define custom responses to various key actions within their applications.

## MouseListener

`MouseListener` is an interface in Java that receives mouse events. It can detect mouse clicks, presses, releases, enters, and exits on a component. This is useful for creating interactive GUIs where mouse behavior triggers specific actions.

## Drag & Drop, Point

Drag & Drop is a direct manipulation gesture found in many GUI systems, allowing users to drag an object and drop it onto another object or location. `Point` is a class in Java that represents a location in a coordinate space, which is often used in GUI programming to track mouse positions or to position components.

## Key Bindings

Key Bindings in Java Swing allow developers to bind specific actions to key strokes, providing a more flexible and efficient way of handling keyboard input. Unlike `KeyListener`, key bindings work even when a component doesn't have focus, making them ideal for defining global shortcuts in an application.

## 2D Graphics

Java provides the `Graphics2D` class, an extension of the `Graphics` class, offering more sophisticated control over geometry, coordinate transformations, color management, and text layout. This is the foundation for drawing shapes, text, and images in Java Swing or AWT applications, enabling the creation of rich, custom UI components.
