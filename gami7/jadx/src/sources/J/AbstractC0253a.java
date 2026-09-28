package J;

import android.os.Looper;

/* renamed from: J.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0253a {

    /* renamed from: a, reason: collision with root package name */
    public static final long f4115a;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f4116b = 0;

    static {
        long j3;
        try {
            j3 = Looper.getMainLooper().getThread().getId();
        } catch (Exception unused) {
            j3 = -1;
        }
        f4115a = j3;
    }
}
