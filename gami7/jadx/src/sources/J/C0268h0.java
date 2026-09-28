package J;

import T.AbstractC0379g;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: J.h0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0268h0 extends T.B implements Parcelable, T.p, InterfaceC0258c0, W0 {
    public static final Parcelable.Creator<C0268h0> CREATOR = new C0264f0(1);

    /* renamed from: i, reason: collision with root package name */
    public I0 f4144i;

    public C0268h0(int i2) {
        I0 i02 = new I0(i2);
        if (T.n.f5709a.d() != null) {
            I0 i03 = new I0(i2);
            i03.f5647a = 1;
            i02.f5648b = i03;
        }
        this.f4144i = i02;
    }

    @Override // T.A
    public final T.C a() {
        return this.f4144i;
    }

    @Override // T.A
    public final void b(T.C c3) {
        this.f4144i = (I0) c3;
    }

    @Override // T.p
    public final L0 c() {
        return W.f4109m;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // T.A
    public final T.C e(T.C c3, T.C c4, T.C c5) {
        if (((I0) c4).f4038c == ((I0) c5).f4038c) {
            return c4;
        }
        return null;
    }

    public final int g() {
        return ((I0) T.n.t(this.f4144i, this)).f4038c;
    }

    @Override // J.W0
    public Object getValue() {
        return Integer.valueOf(g());
    }

    public final void h(int i2) {
        AbstractC0379g k3;
        I0 i02 = (I0) T.n.i(this.f4144i);
        if (i02.f4038c != i2) {
            I0 i03 = this.f4144i;
            synchronized (T.n.f5710b) {
                k3 = T.n.k();
                ((I0) T.n.o(i03, this, k3, i02)).f4038c = i2;
            }
            T.n.n(k3, this);
        }
    }

    @Override // J.InterfaceC0258c0
    public void setValue(Object obj) {
        h(((Number) obj).intValue());
    }

    public final String toString() {
        return "MutableIntState(value=" + ((I0) T.n.i(this.f4144i)).f4038c + ")@" + hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        parcel.writeInt(g());
    }
}
