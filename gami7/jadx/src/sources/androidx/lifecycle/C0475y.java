package androidx.lifecycle;

import android.os.Looper;
import h.C0694b;
import i.C0703d;
import i.C0705f;
import java.util.Map;

/* renamed from: androidx.lifecycle.y, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0475y {

    /* renamed from: h, reason: collision with root package name */
    public static final Object f6919h = new Object();

    /* renamed from: a, reason: collision with root package name */
    public final Object f6920a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public final C0705f f6921b = new C0705f();

    /* renamed from: c, reason: collision with root package name */
    public volatile Object f6922c;

    /* renamed from: d, reason: collision with root package name */
    public volatile Object f6923d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f6924e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f6925f;

    /* renamed from: g, reason: collision with root package name */
    public final B1.E f6926g;

    public C0475y() {
        Object obj = f6919h;
        this.f6923d = obj;
        this.f6926g = new B1.E(1, this);
        this.f6922c = obj;
    }

    public final void a(Object obj) {
        C0694b.N().f7779f.getClass();
        if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
            throw new IllegalStateException("Cannot invoke setValue on a background thread");
        }
        this.f6922c = obj;
        if (this.f6924e) {
            this.f6925f = true;
            return;
        }
        this.f6924e = true;
        do {
            this.f6925f = false;
            C0705f c0705f = this.f6921b;
            c0705f.getClass();
            C0703d c0703d = new C0703d(c0705f);
            c0705f.f7801j.put(c0703d, Boolean.FALSE);
            if (c0703d.hasNext()) {
                B1.t.w(((Map.Entry) c0703d.next()).getValue());
                throw null;
            }
        } while (this.f6925f);
        this.f6924e = false;
    }
}
