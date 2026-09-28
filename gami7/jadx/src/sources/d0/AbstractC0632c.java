package d0;

import B1.t;

/* renamed from: d0.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0632c {

    /* renamed from: a, reason: collision with root package name */
    public final String f7396a;

    /* renamed from: b, reason: collision with root package name */
    public final long f7397b;

    /* renamed from: c, reason: collision with root package name */
    public final int f7398c;

    public AbstractC0632c(String str, long j3, int i2) {
        this.f7396a = str;
        this.f7397b = j3;
        this.f7398c = i2;
        if (str.length() == 0) {
            throw new IllegalArgumentException("The name of a color space cannot be null and must contain at least 1 character");
        }
        if (i2 < -1 || i2 > 63) {
            throw new IllegalArgumentException("The id must be between -1 and 63");
        }
    }

    public abstract float a(int i2);

    public abstract float b(int i2);

    public boolean c() {
        return false;
    }

    public abstract long d(float f3, float f4, float f5);

    public abstract float e(float f3, float f4, float f5);

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AbstractC0632c abstractC0632c = (AbstractC0632c) obj;
        if (this.f7398c == abstractC0632c.f7398c && z2.h.a(this.f7396a, abstractC0632c.f7396a)) {
            return AbstractC0631b.a(this.f7397b, abstractC0632c.f7397b);
        }
        return false;
    }

    public abstract long f(float f3, float f4, float f5, float f6, AbstractC0632c abstractC0632c);

    public int hashCode() {
        int hashCode = this.f7396a.hashCode() * 31;
        int i2 = AbstractC0631b.f7395e;
        return t.d(hashCode, 31, this.f7397b) + this.f7398c;
    }

    public final String toString() {
        return this.f7396a + " (id=" + this.f7398c + ", model=" + ((Object) AbstractC0631b.b(this.f7397b)) + ')';
    }
}
