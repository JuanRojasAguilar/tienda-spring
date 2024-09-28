import { Link, Button, Tooltip } from "@nextui-org/react";

const HomeButton = ({ className }) => {
  return (
    <Link href="/" className={`${className}`}>
      <Tooltip showArrow={true} placement="right" content="Pagina principal">
        <Button
          radius="full"
          size="md"
          className="text-white text-2xl font-bold"
        >
          &lt;
        </Button>
      </Tooltip>
    </Link>
  );
};

export default HomeButton;
