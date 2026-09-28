package l;

import m.InterfaceC0819C;

/* loaded from: classes.dex */
public final class I implements InterfaceC0819C {

    /* renamed from: h, reason: collision with root package name */
    public final float f8137h;

    /* renamed from: i, reason: collision with root package name */
    public final float f8138i;

    public I(float f3, O0.b bVar) {
        this.f8137h = f3;
        float c3 = bVar.c();
        float f4 = J.f8139a;
        this.f8138i = c3 * 386.0878f * 160.0f * 0.84f;
    }

    public H a(float f3) {
        double b3 = b(f3);
        double d3 = J.f8139a;
        double d4 = d3 - 1.0d;
        return new H(f3, (float) (Math.exp((d3 / d4) * b3) * this.f8137h * this.f8138i), (long) (Math.exp(b3 / d4) * 1000.0d));
    }

    public double b(float f3) {
        float[] fArr = AbstractC0793b.f8175a;
        return Math.log((Math.abs(f3) * 0.35f) / (this.f8137h * this.f8138i));
    }

    @Override // m.InterfaceC0819C
    public float d(float f3, float f4) {
        if (Math.abs(f4) <= this.f8137h) {
            return f3;
        }
        double log = Math.log(Math.abs(r1 / f4));
        float f5 = this.f8138i;
        double d3 = f5;
        float f6 = f4 / f5;
        return (f6 * ((float) Math.exp((d3 * ((log / d3) * 1000)) / 1000.0f))) + (f3 - f6);
    }

    @Override // m.InterfaceC0819C
    public float m(float f3, long j3) {
        return f3 * ((float) Math.exp(((j3 / 1000000) / 1000.0f) * this.f8138i));
    }

    @Override // m.InterfaceC0819C
    public float n(float f3, float f4, long j3) {
        float f5 = f4 / this.f8138i;
        return (f5 * ((float) Math.exp((r0 * (j3 / 1000000)) / 1000.0f))) + (f3 - f5);
    }

    @Override // m.InterfaceC0819C
    public long p(float f3) {
        return ((long) ((((float) Math.log(this.f8137h / Math.abs(f3))) * 1000.0f) / this.f8138i)) * 1000000;
    }

    @Override // m.InterfaceC0819C
    public float q() {
        return this.f8137h;
    }

    public I(float f3, float f4) {
        this.f8137h = Math.max(1.0E-7f, Math.abs(f4));
        this.f8138i = Math.max(1.0E-4f, f3) * (-4.2f);
    }
}
