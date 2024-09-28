import {
  Modal,
  ModalContent,
  ModalHeader,
  ModalBody,
  ModalFooter,
  Button,
} from "@nextui-org/react";
const ProductCreatedModal = ({ name, price, stock, isOpen, onClose}) => {
  return (
    <Modal backdrop="blur" isOpen={isOpen} onClose={onClose}>
      <ModalContent>
        {(onClose) => (
          <>
            <ModalHeader className="text-2xl text-center w-full">
              Producto Creado
            </ModalHeader>
            <ModalBody>
              <div className="flex justify-between">
                <h3 className="font-bold">Nombre:</h3>
                <p>{name}</p>
              </div>
              <div className="flex justify-between">
                <h3 className="font-bold">Precio:</h3>
                <p>{price}</p>
              </div>
              <div className="flex justify-between">
                <h3 className="font-bold">Existencias:</h3>
                <p>{stock}</p>
              </div>
            </ModalBody>
            <ModalFooter>
              <Button color="danger" variant="bordered" onPress={onClose}>
                Cerrar
              </Button>
            </ModalFooter>
          </>
        )}
      </ModalContent>
    </Modal>
  );
};

export default ProductCreatedModal;
