"use client";

import Link from "next/link";
import { Tooltip, Button, Input } from "@nextui-org/react";
import { NextUIProvider } from "@nextui-org/react";

const Styles = {
  backBtn: `
    absolute
    top-8
    left-8
    w-16 
    h-16 
    border-4
    border-white
    text-white
    font-semibold
    text-3xl 
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
        text-6xl
        font-bold
    `,
  fieldContainer: `
      w-full
      flex
      flex-col
      items-center
      gap-8
  `,
  fieldset: `
        w-1/5
        flex
        justify-center
    `,
  label: `
        w-1/2
        text-white
        text-3xl

    `,
  Input: `
        rounded-lg
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
  registerBtn: `
  `,
  resetBtn: `
  `,
};

const CreateProduct = () => {
  return (
    <NextUIProvider>
      <form className={Styles.form}>
        <Tooltip
          className="w-[240px] text-2xl"
          showArrow={true}
          placement="right"
          content="Pagina principal"
        >
          <Button radius="full" size="md" className={Styles.backBtn} href={"/"}>
            &lt;
          </Button>
        </Tooltip>

        <h1 className={Styles.title}>Crear Producto Nuevo</h1>

        <div className={Styles.fieldContainer}>
          <fieldset className={Styles.fieldset}>
            <Input
              size="lg"
              variant="ghost"
              isRequired
              label="Nombre"
              type="text"
              placeholder="Ingresa el nombre"
              className={Styles.Input}
            />
          </fieldset>

          <fieldset className={Styles.fieldset}>
            <Input
              size="lg"
              isRequired
              label="Precio"
              variant="ghost"
              placeholder="Ingresa el precio"
              type="number"
              min={0}
              step={0.01}
              max={1_000_000_000}
              className={Styles.Input}
            />
          </fieldset>

          <fieldset className={Styles.fieldset}>
            <Input
              className={Styles.Input}
              label="Existencias"
              placeholder="¿Cuantos hay?"
              size="lg"
              variant="ghost"
              type="number"
              name="name"
              id="name"
              min={0}
              max={2_000_000_000}
            />
          </fieldset>
        </div>

        <div>
          <Button
            className={`${Styles.button}`}
            color="success"
            variant="shadow"
            type="submit"
            value="Registrar producto"
          >
            Registrar
          </Button>
          <Button
            className={`${Styles.button}`}
            type="submit"
            color="danger"
            variant="shadow"
            value="Reiniciar"
          >
            Reiniciar Formulario
          </Button>
        </div>
      </form>
    </NextUIProvider>
  );
};

export default CreateProduct;
