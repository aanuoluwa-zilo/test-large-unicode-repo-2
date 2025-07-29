# Code embedding file 3 - MVC Pattern
from abc import ABC, abstractmethod

class Model:
    def __init__(self):
        self.data = {}
    
    def get_data(self):
        return self.data
    
    def set_data(self, key, value):
        self.data[key] = value

class View:
    def display(self, data):
        print(f"Displaying: {data}")

class Controller:
    def __init__(self, model, view):
        self.model = model
        self.view = view
    
    def update(self, key, value):
        self.model.set_data(key, value)
        self.view.display(self.model.get_data())

# Usage
model = Model()
view = View()
controller = Controller(model, view)
controller.update("test", "value")
