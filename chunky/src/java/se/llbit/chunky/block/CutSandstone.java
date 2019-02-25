package se.llbit.chunky.block;

import se.llbit.chunky.model.TexturedBlockModel;
import se.llbit.chunky.renderer.scene.Scene;
import se.llbit.chunky.resources.Texture;
import se.llbit.math.Ray;

public class CutSandstone extends MinecraftBlock {
  private static final Texture[] texture = {
      Texture.sandstoneCut, Texture.sandstoneCut, Texture.sandstoneCut,
      Texture.sandstoneCut, Texture.sandstoneTop, Texture.sandstoneBottom,
  };

  public CutSandstone() {
    super("cut_sandstone", texture[0]);
    localIntersect = true;
  }

  @Override public boolean intersect(Ray ray, Scene scene) {
    return TexturedBlockModel.intersect(ray, texture);
  }
}