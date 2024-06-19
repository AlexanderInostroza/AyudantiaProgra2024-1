import pyodbc

str_de_conexion = "DRIVER={SQL Server};\
    Server=localhost\SQLEXPRESS01;\
        Database=MultiUSM;\
            Trusted_Connection=True;"
def main():
    connection = pyodbc.connect(str_de_conexion)
    cursor = connection.cursor()

    cursor.execute("CREATE TABLE Productos (prod_id bigint,\
                    prod_name VARCHAR(150), prod_description VARCHAR(150),\
                    prod_brand VARCHAR(150), category VARCHAR(150), \
                   prod_unit_price int)")

    nombre_producto = "algun producto"
    cursor.execute("SELECT * FROM Productos WHERE prod_name='"+ nombre_producto +"'")
    prod_encontrado = cursor.fetchall()
    if len(prod_encontrado) > 0:
        # pueden haber varios productos con el mismo nombre
        for prod_id, prod_name, prod_description, prod_brand, category, prod_unit_price in prod_encontrado:
            print("-----------------------------------------------------------------")
            print("ID del producto: {}".format(prod_id))
            print("Nombre: {}".format(prod_name))
            print("Descripción: {}".format(prod_description))
            print("Marca: {}".format(prod_brand))
            print("Categoría: {}".format(category))
            print("Precio: {}".format(prod_unit_price))
            print("-----------------------------------------------------------------")
    else:
        print("-----------------------------------------------------------------")
        print("PRODUCTO NO ENCONTRADO")
        print("-----------------------------------------------------------------")


    connection.commit()
    cursor.close()
    connection.close()