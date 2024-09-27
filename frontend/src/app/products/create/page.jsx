"use client";

import { FormEvent } from "react";

const Styles = {
  form: `
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
  input: `
        w-1/2
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
      bg-green-700
      hover:bg-green-600
      hover:shadow-green-700
  `,
  resetBtn: `
      bg-red-500
      hover:bg-red-600
      hover:shadow-red-700
  `,
};

const CreateProduct = () => {
  return (
    <form className={Styles.form}>
      <h1 className={Styles.title}>Crear Producto Nuevo</h1>

      <>
        <fieldset className={Styles.fieldset}>
          <label htmlFor="name" className={Styles.label}>
            Nombre:
          </label>
          <input type="text" name="name" id="name" className={Styles.input} />
        </fieldset>

        <fieldset className={Styles.fieldset}>
          <label htmlFor="name" className={Styles.label}>
            Precio:
          </label>
          <input
            type="number"
            name="name"
            id="name"
            min={0}
            step={0.01}
            max={1_000_000_000}
            className={Styles.input}
          />
        </fieldset>

        <fieldset className={Styles.fieldset}>
          <label htmlFor="name" className={Styles.label}>
            Stock:
          </label>
          <input
            className={Styles.input}
            type="number"
            name="name"
            id="name"
            min={0}
            max={2_000_000_000}
          />
        </fieldset>
      </>

      <div>
        <input
          className={`${Styles.button} ${Styles.registerBtn}`}
          type="submit"
          value="Registrar producto"
        />
        <input
          className={`${Styles.button} ${Styles.resetBtn}`}
          type="submit"
          value="Reiniciar"
        />
      </div>
    </form>
  );
};

export default CreateProduct;
