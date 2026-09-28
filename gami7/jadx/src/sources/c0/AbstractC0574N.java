package c0;

import android.graphics.Shader;

/* renamed from: c0.N, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0574N extends AbstractC0598q {

    /* renamed from: a, reason: collision with root package name */
    public Shader f7217a;

    /* renamed from: b, reason: collision with root package name */
    public long f7218b = 9205357640488583168L;

    @Override // c0.AbstractC0598q
    public final void a(float f3, long j3, C0589h c0589h) {
        Shader shader = this.f7217a;
        if (shader == null || !b0.f.a(this.f7218b, j3)) {
            if (b0.f.e(j3)) {
                shader = null;
                this.f7217a = null;
                this.f7218b = 9205357640488583168L;
            } else {
                shader = b(j3);
                this.f7217a = shader;
                this.f7218b = j3;
            }
        }
        long c3 = AbstractC0571K.c(c0589h.f7254a.getColor());
        long j4 = C0603v.f7272b;
        if (!C0603v.c(c3, j4)) {
            c0589h.e(j4);
        }
        if (!z2.h.a(c0589h.f7256c, shader)) {
            c0589h.h(shader);
        }
        if (c0589h.f7254a.getAlpha() / 255.0f == f3) {
            return;
        }
        c0589h.c(f3);
    }

    public abstract Shader b(long j3);
}
