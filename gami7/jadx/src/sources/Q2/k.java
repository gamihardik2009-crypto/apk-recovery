package Q2;

import O2.AbstractC0369a;
import O2.w;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public abstract class k {

    /* renamed from: a, reason: collision with root package name */
    public static final String f5353a;

    /* renamed from: b, reason: collision with root package name */
    public static final long f5354b;

    /* renamed from: c, reason: collision with root package name */
    public static final int f5355c;

    /* renamed from: d, reason: collision with root package name */
    public static final int f5356d;

    /* renamed from: e, reason: collision with root package name */
    public static final long f5357e;

    /* renamed from: f, reason: collision with root package name */
    public static final f f5358f;

    /* renamed from: g, reason: collision with root package name */
    public static final i f5359g;

    /* renamed from: h, reason: collision with root package name */
    public static final i f5360h;

    static {
        String str;
        int i2 = w.f5210a;
        try {
            str = System.getProperty("kotlinx.coroutines.scheduler.default.name");
        } catch (SecurityException unused) {
            str = null;
        }
        if (str == null) {
            str = "DefaultDispatcher";
        }
        f5353a = str;
        f5354b = AbstractC0369a.i("kotlinx.coroutines.scheduler.resolution.ns", 100000L, 1L, Long.MAX_VALUE);
        int i3 = w.f5210a;
        if (i3 < 2) {
            i3 = 2;
        }
        f5355c = AbstractC0369a.j("kotlinx.coroutines.scheduler.core.pool.size", i3, 1, 0, 8);
        f5356d = AbstractC0369a.j("kotlinx.coroutines.scheduler.max.pool.size", 2097150, 0, 2097150, 4);
        f5357e = TimeUnit.SECONDS.toNanos(AbstractC0369a.i("kotlinx.coroutines.scheduler.keep.alive.sec", 60L, 1L, Long.MAX_VALUE));
        f5358f = f.f5347a;
        f5359g = new i(0);
        f5360h = new i(1);
    }
}
