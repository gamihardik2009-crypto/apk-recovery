package D2;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;
import z2.h;

/* loaded from: classes.dex */
public final class a extends C2.a {
    @Override // C2.a
    public final Random a() {
        ThreadLocalRandom current = ThreadLocalRandom.current();
        h.e(current, "current(...)");
        return current;
    }
}
