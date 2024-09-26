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
    `
};

const CreateProduct = () => {
  return (
    <form className={Styles.form}>
      <h1 className={Styles.title}>Crear Producto Nuevo</h1>

      <fieldset className={Styles.fieldset}>
        <label htmlFor="name" className="w-1/2">Nombre:</label>
        <input type="text" name="name" id="name" className="w-1/2"/>
      </fieldset>

      <fieldset className={Styles.fieldset}>
        <label htmlFor="name">Precio:</label>
        <input
          type="number"
          name="name"
          id="name"
          min={0}
          step={0.01}
          max={1_000_000_000}
        />
      </fieldset>

      <fieldset className={Styles.fieldset}>
        <label htmlFor="name">Stock:</label>
        <input type="number" name="name" id="name" min={0} max={2_000_000_000} />
      </fieldset>

      <div>
        <input type="submit" value="Registrar producto" />
        <input type="submit" value="Reiniciar" />
      </div>
    </form>
  );
};

export default CreateProduct;
