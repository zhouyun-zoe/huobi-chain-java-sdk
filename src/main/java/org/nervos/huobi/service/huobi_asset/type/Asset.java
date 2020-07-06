package org.nervos.huobi.service.huobi_asset.type;

import java.math.BigInteger;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.nervos.muta.client.type.graphql_schema_scalar.Address;
import org.nervos.muta.client.type.graphql_schema_scalar.Hash;
import org.nervos.muta.client.type.primitive.U64;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Asset {
  private Hash id;
  private String name;
  private String symbol;
  private U64 supply;
  private U64 precision;
  private Address issuer;
}
