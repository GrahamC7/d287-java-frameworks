package com.example.demo.bootstrap;

import com.example.demo.domain.InhousePart;
import com.example.demo.domain.OutsourcedPart;
import com.example.demo.repositories.InhousePartRepository;
import com.example.demo.repositories.OutsourcedPartRepository;
import com.example.demo.repositories.PartRepository;
import com.example.demo.repositories.ProductRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 *
 *
 *
 *
 */
@Component
public class BootStrapData implements CommandLineRunner {

    private final PartRepository partRepository;
    private final ProductRepository productRepository;
    private final InhousePartRepository inHousePartRepository;
    private final OutsourcedPartRepository outsourcedPartRepository;

    public BootStrapData(PartRepository partRepository, ProductRepository productRepository,InhousePartRepository inhousePartRepository,OutsourcedPartRepository outsourcedPartRepository) {
        this.partRepository = partRepository;
        this.productRepository = productRepository;
        this.inHousePartRepository = inhousePartRepository;
        this.outsourcedPartRepository=outsourcedPartRepository;
    }

    @Override
    public void run(String... args) throws Exception {

        List<InhousePart> inhouseParts = (List<InhousePart>) inHousePartRepository.findAll();

        InhousePart inHousePart1 = new InhousePart();
        inHousePart1.setId(001);
        inHousePart1.setName("Axle-Back Exhaust");
        inHousePart1.setPrice(400.00);
        inHousePart1.setInv(10);
        inHousePart1.setMinInv(1);
        inHousePart1.setMaxInv(20);
        inHousePartRepository.save(inHousePart1);
        InhousePart thePart = null;
        inhouseParts = (List<InhousePart>) inHousePartRepository.findAll();
        for(InhousePart inhousePart : inhouseParts) {
            if(inhousePart.getName().equals("Axle-Back Exhaust")) {}
        }

        InhousePart inHousePart2 = new InhousePart();
        inHousePart2.setId(002);
        inHousePart2.setName("Cat-Back Exhaust");
        inHousePart2.setPrice(900.00);
        inHousePart2.setInv(10);
        inHousePart2.setMinInv(1);
        inHousePart2.setMaxInv(20);
        inHousePartRepository.save(inHousePart2);
        thePart = null;
        inhouseParts = (List<InhousePart>) inHousePartRepository.findAll();
        for(InhousePart inhousePart : inhouseParts) {
            if(inhousePart.getName().equals("Cat-back Exhaust")) {}
        }

        InhousePart inHousePart3 = new InhousePart();
        inHousePart3.setId(003);
        inHousePart3.setName("Longtube Headers");
        inHousePart3.setPrice(600.00);
        inHousePart3.setInv(10);
        inHousePart3.setMinInv(1);
        inHousePart3.setMaxInv(20);
        inHousePartRepository.save(inHousePart3);
        thePart = null;
        inhouseParts = (List<InhousePart>) inHousePartRepository.findAll();
        for(InhousePart inhousePart : inhouseParts) {
            if(inhousePart.getName().equals("Longtube Headers")) {}
        }

        InhousePart inHousePart4 = new InhousePart();
        inHousePart4.setId(004);
        inHousePart4.setName("X-Pipe");
        inHousePart4.setPrice(300.00);
        inHousePart4.setInv(10);
        inHousePart4.setMinInv(1);
        inHousePart4.setMaxInv(20);
        inHousePartRepository.save(inHousePart4);
        thePart = null;
        inhouseParts = (List<InhousePart>) inHousePartRepository.findAll();
        for(InhousePart inhousePart : inhouseParts) {
            if(inhousePart.getName().equals("X-Pipe")) {}
        }

        InhousePart inHousePart5 = new InhousePart();
        inHousePart5.setId(005);
        inHousePart5.setName("High Flow Cats");
        inHousePart5.setPrice(300.00);
        inHousePart5.setInv(10);
        inHousePart5.setMinInv(1);
        inHousePart5.setMaxInv(20);
        inHousePartRepository.save(inHousePart5);
        thePart = null;
        inhouseParts = (List<InhousePart>) inHousePartRepository.findAll();
        for(InhousePart inhousePart : inhouseParts) {
            if(inhousePart.getName().equals("High Flow Cats")) {}
        }





       /*
        OutsourcedPart o= new OutsourcedPart();
        o.setCompanyName("Western Governors University");
        o.setName("out test");
        o.setInv(5);
        o.setPrice(20.0);
        o.setId(100L);
        outsourcedPartRepository.save(o);
        OutsourcedPart thePart=null;
        List<OutsourcedPart> outsourcedParts=(List<OutsourcedPart>) outsourcedPartRepository.findAll();
        for(OutsourcedPart part:outsourcedParts){
            if(part.getName().equals("out test"))thePart=part;
        }

        System.out.println(thePart.getCompanyName());
        */
        List<OutsourcedPart> outsourcedParts=(List<OutsourcedPart>) outsourcedPartRepository.findAll();
        for(OutsourcedPart part:outsourcedParts){
            System.out.println(part.getName()+" "+part.getCompanyName());
        }

        /*
        Product bicycle= new Product("bicycle",100.0,15);
        Product unicycle= new Product("unicycle",100.0,15);
        productRepository.save(bicycle);
        productRepository.save(unicycle);
        */

        System.out.println("Started in Bootstrap");
        System.out.println("Number of Products"+productRepository.count());
        System.out.println(productRepository.findAll());
        System.out.println("Number of Parts"+partRepository.count());
        System.out.println(partRepository.findAll());

    }
}
