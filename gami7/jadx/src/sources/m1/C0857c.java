package m1;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;

/* renamed from: m1.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0857c {

    /* renamed from: a, reason: collision with root package name */
    public final C0858d f8636a = new C0858d();

    /* renamed from: b, reason: collision with root package name */
    public final LinkedHashMap f8637b = new LinkedHashMap();

    /* renamed from: c, reason: collision with root package name */
    public final LinkedHashSet f8638c = new LinkedHashSet();

    /* renamed from: d, reason: collision with root package name */
    public volatile boolean f8639d;

    public static void a(AutoCloseable autoCloseable) {
        if (autoCloseable != null) {
            try {
                autoCloseable.close();
            } catch (Exception e3) {
                throw new RuntimeException(e3);
            }
        }
    }
}
