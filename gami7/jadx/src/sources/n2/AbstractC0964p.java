package n2;

import java.util.Collection;

/* renamed from: n2.p, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0964p extends AbstractC0963o {
    public static int z(Iterable iterable, int i2) {
        z2.h.f(iterable, "<this>");
        return iterable instanceof Collection ? ((Collection) iterable).size() : i2;
    }
}
