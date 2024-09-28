"use client";

import {
  Input,
  Button,
  useDisclosure,
  NextUIProvider,
} from "@nextui-org/react";
import { useState } from "react";
import HomeButton from "@/app/components/HomeButton";
import ProductCreatedModal from "./ProductCreatedModal";

const Styles = {
  backBtn: `
    absolute
    top-8
    left-8
    border-4
    border-white
    rounded-full
    z-2
  `,
  form: `
    relative
    h-screen
    w-screen
    flex
    flex-col
    bg-slate-400
    items-center
    justify-center
    gap-4
  `,
  title: `
    text-white
    text-4xl
    font-bold
  `,
  fieldContainer: `
    w-full
    flex
    flex-col
    items-center
    gap-8
    my-12
  `,
  label: `
    w-1/2
    text-white
  `,
  Input: `
    rounded-lg
    w-1/3
    flex
    justify-center
  `,
  button: `
    mx-4
    rounded-xl
    text-white
    text-xl
    font-bold
    w-[240px]
    h-[60px]
    transition
    hover:cursor-pointer
    hover:shadow-lg
  `,
};

const CreateProduct = () => {
  const { isOpen, onOpen, onClose } = useDisclosure();
  const [name, setName] = useState("");
  const [price, setPrice] = useState("");
  const [stock, setStock] = useState("");

  const cleanForm = () => {
    setName("");
    setPrice("");
    setStock("");
  };

  const onSubmit = (e) => {
    e.preventDefault();
    onOpen();
  };

  return (
    <NextUIProvider>
      <form className={Styles.form} onSubmit={onSubmit}>
        <HomeButton className={Styles.backBtn} />
        <h1 className={Styles.title}>Crear Producto Nuevo</h1>

        <div className={Styles.fieldContainer}>
          <Input
            onChange={(e) => setName(e.target.value)}
            name="name"
            variant="ghost"
            isRequired
            label="Nombre"
            type="text"
            placeholder="Ingresa el nombre"
            value={name}
            className={Styles.Input}
          />

          <Input
            onChange={(e) => setPrice(e.target.value)}
            name="price"
            isRequired
            label="Precio"
            variant="ghost"
            placeholder="0.00"
            type="number"
            min={0}
            value={price}
            step={0.01}
            max={1_000_000_000}
            className={Styles.Input}
            startContent="$"
          />

          <Input
            value={stock}
            className={Styles.Input}
            onChange={(e) => setStock(e.target.value)}
            label="Existencias"
            name="stock"
            placeholder="0"
            variant="ghost"
            type="number"
            min={0}
            max={2_000_000_000}
          />
        </div>

        <div>
          <Button
            className={`${Styles.button}`}
            color="success"
            variant="shadow"
            type="submit"
          >
            Registrar
          </Button>
          <Button
            className={`${Styles.button}`}
            color="danger"
            variant="shadow"
            onPress={cleanForm}
          >
            Limpiar Formulario
          </Button>
        </div>
      </form>
      <ProductCreatedModal
        name={name}
        price={price}
        stock={stock}
        isOpen={isOpen}
        onClose={onClose}
      />
    </NextUIProvider>
  );
};

export default CreateProduct;
