package J;

import T.AbstractC0379g;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: J.k0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0274k0 extends T.B implements Parcelable, T.p {
    public static final Parcelable.Creator<C0274k0> CREATOR = new C0272j0();

    /* renamed from: i, reason: collision with root package name */
    public final L0 f4148i;

    /* renamed from: j, reason: collision with root package name */
    public K0 f4149j;

    public C0274k0(Object obj, L0 l02) {
        this.f4148i = l02;
        K0 k02 = new K0(obj);
        if (T.n.f5709a.d() != null) {
            K0 k03 = new K0(obj);
            k03.f5647a = 1;
            k02.f5648b = k03;
        }
        this.f4149j = k02;
    }

    @Override // T.A
    public final T.C a() {
        return this.f4149j;
    }

    @Override // T.A
    public final void b(T.C c3) {
        this.f4149j = (K0) c3;
    }

    @Override // T.p
    public final L0 c() {
        return this.f4148i;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // T.A
    public final T.C e(T.C c3, T.C c4, T.C c5) {
        if (this.f4148i.a(((K0) c4).f4044c, ((K0) c5).f4044c)) {
            return c4;
        }
        return null;
    }

    @Override // J.W0
    public final Object getValue() {
        return ((K0) T.n.t(this.f4149j, this)).f4044c;
    }

    @Override // J.InterfaceC0258c0
    public final void setValue(Object obj) {
        AbstractC0379g k3;
        K0 k02 = (K0) T.n.i(this.f4149j);
        if (this.f4148i.a(k02.f4044c, obj)) {
            return;
        }
        K0 k03 = this.f4149j;
        synchronized (T.n.f5710b) {
            k3 = T.n.k();
            ((K0) T.n.o(k03, this, k3, k02)).f4044c = obj;
        }
        T.n.n(k3, this);
    }

    public final String toString() {
        return "MutableState(value=" + ((K0) T.n.i(this.f4149j)).f4044c + ")@" + hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int i3;
        parcel.writeValue(getValue());
        W w2 = W.f4106j;
        L0 l02 = this.f4148i;
        if (z2.h.a(l02, w2)) {
            i3 = 0;
        } else if (z2.h.a(l02, W.f4109m)) {
            i3 = 1;
        } else {
            if (!z2.h.a(l02, W.f4107k)) {
                throw new IllegalStateException("Only known types of MutableState's SnapshotMutationPolicy are supported");
            }
            i3 = 2;
        }
        parcel.writeInt(i3);
    }
}
